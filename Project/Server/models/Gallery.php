<?php

	namespace Wisata;

	use Phalcon\Mvc\Model;

	class Gallery extends Model
	{
		public $place_id;
		public $id;
		public $link_photo;
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