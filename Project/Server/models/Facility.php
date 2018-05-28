<?php

	namespace Wisata;

	use Phalcon\Mvc\Model;

	class Facility extends Model
	{
		public $id;
		public $title;
		public $note;
		
		public function initialize()
		{
			$this->hasManyToMany(
				'id',
				'Wisata\HasFacility',
				'facility_id', 'place_id',
				'Wisata\Place',
				'id'
			);
		}

	}
	
?>