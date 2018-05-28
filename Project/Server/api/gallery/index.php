<?php

	use Phalcon\Loader;
	use Phalcon\Http\Response;

	/**
		Load Model and Config
	**/
	$loader = new Loader();

	$loader->registerNamespaces(
		[
			'Wisata' => $_SERVER['DOCUMENT_ROOT'].'/cometogarut/models/'
		]
	);
	
	$loader->registerClasses(
		[
			'GarutApp' => $_SERVER['DOCUMENT_ROOT'].'/cometogarut/config/GarutApp.php'
		]
	);
	
	$loader->register();
	
	/**
		Instantiate GarutApp
	**/
	$app = new GarutApp();

	/**
		Retrieves Gallery by place id
	**/
	$app->get(
		'/place/{id:[0-9]+}',
		function ($id) use ($app) 
		{
			$response = new Response();
			
			$place = Wisata\Gallery::find(
				[
					'place_id = ?1',
					'bind' => [
						1 => $id
					]
				]
			);
			
			if($place === false)
			{
				$response->setStatusCode(404, 'Not Found');
				
				$response->setJsonContent(
					[
						'status' => 'ERROR',
						'message'   => '404 Not Found'
					]
				);
			}
			else
			{
				$response->setStatusCode(200, 'OK');
				
				$response->setJsonContent(
					[
						'status' => 'OK',
						'data'   => $place
					]
				);
				
			}
			
			return $response;
		}
	);

	/**
		Adds New Gallery
	**/
	$app->post(
		'/',
		function () use ($app) 
		{
			$data = $app->request->getJsonRawBody();

			$place_m = new Wisata\Gallery();
			
			foreach($data as $key => $value)
				$place_m->{$key} = $value;
			
			// Create a response
			$response = new Response();

			// Check if the insertion was successful
			if ($place_m->save() === false) 
			{
				// Change the HTTP status
				$response->setStatusCode(409, 'Conflict');

				// Send errors to the client
				$errors = [];

				foreach ($status->getMessages() as $message) 
				{
					$errors[] = $message->getMessage();
				}

				$response->setJsonContent(
					[
						'status'   => 'ERROR',
						'messages' => $errors,
					]
				);
			} 
			else 
			{
				// Change the HTTP status
				$response->setStatusCode(201, 'Created');
				
				$response->setJsonContent(
					[
						'status' => 'OK',
						'data'   => $place_m,
					]
				);
			}

			return $response;
		}
	);

?>