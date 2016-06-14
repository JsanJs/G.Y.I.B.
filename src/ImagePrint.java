import java.awt.Image;

public class ImagePrint {

	String file;
	int diet;
	int upper;
	int lower;
	
	public ImagePrint(int center, int up, int low){
		diet = center;
		upper = up;
		lower = low;
	}
	

	public String fileimg(){
		//skinny dude.
		if(diet == -1 && upper == -1 && lower == -1){
			file = "Combos_png/SSS.png";
		//skinny dude with avg legs.
		}else if(diet == -1 && upper ==  -1 && lower == 0){
			file = "Combos_png/SSN.png";
		//skinny dude with avg legs and arms.
		}else if(diet == -1 && upper ==  0 && lower == 0){
			file = "Combos_png/SNN.png";
		//avg dude.
		}else if(diet == 0 && upper ==  0 && lower == 0){
			file = "Combos_png/NNN.png";
		//avg dude with buff legs.
		}else if(diet == 0 && upper ==  0 && lower == 1){
			file = "Combos_png/NNB.png";
		//avg dude with buff legs and arms.
		}else if(diet == 0 && upper ==  1 && lower == 1){
			file = "Combos_png/NBB.png";
		//buff dude.
		}else if(diet == 1 && upper ==  1 && lower == 1){
			file = "Combos_png/BBB.png";
		//buff dude with avg legs.
		}else if(diet == 1 && upper ==  1 && lower == 0){
			file = "Combos_png/BBN.png";
		//buff dude with avg legs and arms.
		}else if(diet == 1 && upper ==  0 && lower == 0){
			file = "Combos_png/BNN.png";
		//buff dude with skinny legs.
		}else if(diet == 1 && upper ==  1 && lower == -1){
			file = "Combos_png/BBS.png";
		//buff dude with skinny legs and arms.
		}else if(diet == 1 && upper ==  -1 && lower == -1){
			file = "Combos_png/BSS.png";
		//buff dude with avg arms.
		}else if(diet == 1 && upper ==  0 && lower == 1){
			file = "Combos_png/BNB.png";
		//buff dude with avg arms and skinny legs.
		}else if(diet == 1 && upper ==  0 && lower == -1){
			file = "Combos_png/BNS.png";
		//buff dude with skinny arms.
		}else if(diet == 1 && upper ==  -1 && lower == 1){
			file = "Combos_png/BSB.png";
		//buff dude with avg legs and skinny arms.
		}else if(diet == 1 && upper ==  -1 && lower == 0){
			file = "Combos_png/BSN.png";
		//avg dude with buff arms.
		}else if(diet == 0 && upper ==  1 && lower == 0){
			file = "Combos_png/NBN.png";
		//avg dude with buff arms and skinny legs.
		}else if(diet == 0 && upper ==  1 && lower == -1){
			file = "Combos_png/NBS.png";
		//avg dude with skinny legs.
		}else if(diet == 0 && upper ==  0 && lower == -1){
			file = "Combos_png/NNS.png";
		//avg dude with buff legs and skinny arms.
		}else if(diet == 0 && upper ==  -1 && lower == 1){
			file = "Combos_png/NSB.png";
		//avg dude with skinny arms.
		}else if(diet == 0 && upper ==  -1 && lower == 0){
			file = "Combos_png/NSN.png";
		//avg dude with skinny legs and arms.
		}else if(diet == 0 && upper ==  -1 && lower == -1){
			file = "Combos_png/NSS.png";
		//skinny dude with buff legs and arms.
		}else if(diet == -1 && upper ==  1 && lower == 1){
			file = "Combos_png/SBB.png";
		//skinny dude with avg legs and buff arms.
		}else if(diet == -1 && upper ==  1 && lower == 0){
			file = "Combos_png/SBN.png";
		//skinny dude with buff arms.
		}else if(diet == -1 && upper ==  1 && lower == -1){
			file = "Combos_png/SBS.png";
		//skinny dude with buff legs and avg arms.
		}else if(diet == -1 && upper ==  0 && lower == 1){
			file = "Combos_png/SNB.png";
		//skinny dude with avg arms.
		}else if(diet == -1 && upper ==  0 && lower == -1){
			file = "Combos_png/SNS.png";
		//skinny dude with buff arms.
		}else if(diet == -1 && upper ==  -1 && lower == 1){
			file = "Combos_png/SSB.png";
		//our defaulted male.
		}else{
			file = "m_outline.png";
		}
		
		return file;
	}
}
	
