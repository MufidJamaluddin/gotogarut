<?php

	namespace Wisata;

	use Phalcon\Mvc\Model;

	class Suggestion extends Model
	{
		public $place_id;
		public $id;
		public $name;
		public $email;
		public $description;
		
		public function initialize()
		{
			$this->belongsTo(
				'place_id',
				'Wisata\Place',
				'id'
			);
		}
		
	}
	
?>