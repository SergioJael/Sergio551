﻿package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	public class setup extends MovieClip {
      private var piso_new: piso = new piso;
	 // private var fuego_new: fuego = new fuego;
	  private var hulk_new: hulk = new hulk;
	  static var thor_new: thor = new thor;
	  
	  static var puntos_box_new: puntos_box=new puntos_box();
	  static var puntos: Number=0;
	  
	  
		public function setup() {
			// constructor code
			addChild(piso_new);
			piso_new.x=0, piso_new.y=100;
			addChild(puntos_box_new);
			puntos_box_new.x=30, puntos_box_new.y=160
			
			
			//addChild(fuego_new);
			//fuego_new.x=220,fuego_new.y=0;
			
			addChild(hulk_new);
			hulk_new.x=1, hulk_new.y=20;
			
			addChild(thor_new);
			thor_new.x=390, thor_new.y=320;
				
			puntos_box_new.puntos_txt.text=String(puntos);
			this.addEventListener(Event.ENTER_FRAME, actualiza_puntos)
			
			
			
		}
		public function actualiza_puntos(e: Event){
		puntos_box_new.puntos_txt.text=String(puntos);
		}

	}
	
}
