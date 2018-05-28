<?php
	
	/**
		For configuration 
	**/
	use Phalcon\Loader;
	use Phalcon\Mvc\Micro;
	use Phalcon\Di\FactoryDefault;
	use Phalcon\Db\Adapter\Pdo\Mysql as PdoMysql;
	use Phalcon\Http\Response;

	/**
		Class for MicroApp
	**/
	class GarutApp extends Micro
	{
		/**
			Constructor
			Set DB Adapter
		**/
		function __construct()
		{
			$di = new FactoryDefault();
			
			/**
				SetUp Database Service
			**/
			$di->set(
				'db',
				function () {
					return new PdoMysql(
						[
							'host'     => 'localhost',
							'username' => 'root',
							'password' => '',
							'dbname'   => 'cometogarut',
						]
					);
				}
			);
			
			/**
				Init App
			**/
			parent::__construct($di);
			
			/**
				Set Not Found
			**/
			parent::notFound(function() {
				// Create a response
				$response = new Response();

				// Change the HTTP status
				$response->setStatusCode(404, 'Not Found');

				$response->setJsonContent(
					[
						'status'   => '404',
						'messages' => 'Not Found'
					]
				);
				
				return $response;		
			});
		}
		
		/**
			Destructor
		**/
		function __destruct()
		{
			parent::handle();
			//parent::__destruct();
		}
		
	}

?>