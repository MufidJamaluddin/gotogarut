<?php

	namespace Wisata;

	use Phalcon\Mvc\Model;

	class HasFacility extends Model
	{
		public $place_id; 
		public $facility_id; 
		public $description;
		
		public function initialize()
		{
			$this->belongsTo(
				'place_id',
				'Wisata\Place',
				'id'
			);
			
			$this->belongsTo(
				'facility_id',
				'Wisata\Facility',
				'id'
			);
		}

	}
	
?>