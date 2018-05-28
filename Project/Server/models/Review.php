<?php

	namespace Wisata;

	use Phalcon\Mvc\Model;

	class Review extends Model
	{
		public $place_id;
		public $id;
		public $name;
		public $email;
		public $message;
		public $purity_rate; 
		public $policy_rate;
		public $security_rate;
		public $facility_rate;
		
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