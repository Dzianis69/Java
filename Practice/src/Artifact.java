
public class Artifact {


	
		String culture;
		int number,century;
		
		static int count =0;
		public  Artifact(int number) {
			this.number=number;
		}
		public Artifact(int number,String culture){
			this.number=number;
			this.culture=culture;
	}
		public Artifact(int number,String culture,int century){
			this.number=number;
			this.culture=culture;
			this.century=century;
		}
	public static void main(String[] args) {
		Artifact posox=new Artifact(23);
		Artifact czarHat=new Artifact(12,"rusichi");
		Artifact lira=new Artifact(100,"boots",7);
		System.out.println(posox.number);
		System.out.println(czarHat.culture);
		System.out.println(lira.century);
	

		// TODO Auto-generated method stub
		/*
		 * Твоя задача — спроектировать класс Artifact. Артефакты, которые хранятся в
		 * музее, бывают трех видов. Первый — о которых неизвестно ничего, кроме
		 * порядкового номера, присвоенному музеем (например: 212121). Второй — о
		 * которых известен порядковый номер и культура, которой он был создан
		 * (например: 212121, "Ацтеки"). Третий вид — о которых известен порядковый
		 * номер, культура, которой он был создан, и точный век его создания (например:
		 * 212121, "Ацтеки", 12).
		 */
		
		
		
		}

}



