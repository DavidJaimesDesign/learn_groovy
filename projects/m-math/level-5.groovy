//add, substract, multiply, divide fractions
class Level5Loop {
	private Integer level
	private Boolean lessonLoop
	private List 	wrongAnswers
	//private Float progress
	Level5Loop(){
		level = 5
		lessonLoop = true
		wrongAnswers = []
	}
	def start(){
		while (lessonLoop) {
			switch(progress) {
				case 0.00: progress0(); break
				case 0.25: progress25(); break
				case 0.50: progress50(); break
				case 0.75: progress75(); break
				default:   progress0()
			}
		}
	}

	def stop(){
		lessonLoop = false
	}
	//add fractions
	def progress0(){
		def denom_a = Math.abs(new Random().nextInt() % 10) + 2 
		def numer_a = Math.abs(new Random().nextInt() % 10) + 2
		def denom_b = Math.abs(new Random().nextInt() % 50) + 10
		def numer_b = Math.abs(new Random().nextInt() % 50) + 10
	}
	//substract fractions
	def progress25(){

	}
	//multiply fractions and turning to full fractions
	def progress50(){

	}
	//divide fractions
	def progress75(){

	}
}