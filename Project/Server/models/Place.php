<?php

	namespace Wisata;

	use Phalcon\Mvc\Model;

	class Place extends Model
	{
		public $id;
		public $name;
		public $address;
		public $price;
		public $time_begin;
		public $day_begin;
		public $time_end;
		public $day_end;
		public $description;
		public $contact;
		public $latitude;
		public $longitude;
		public $link_photo;
		
		public function initialize()
		{
			$this->hasManyToMany(
				'id',
				'Wisata\HasFacility',
				'place_id', 'facility_id',
				'Wisata\Facility',
				'id'
			);
			
			$this->hasMany(
				'id',
				'Wisata\Review',
				'place_id'
			);
			
			$this->hasMany(
				'id',
				'Wisata\Suggestion',
				'place_id'
			);
			
			$this->hasMany(
				'id',
				'Wisata\Gallery',
				'place_id'
			);
		}
		
	}
	
?>