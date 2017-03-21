//horizontal addition and substraction
class Level1Loop {
	private Integer level
	private Boolean lessonLoop
	private List 	wrongAnswers
	private Float progress
	Level1Loop(i_progress){
		level = 1
		lessonLoop = true
		wrongAnswers = []
		progress = i_progress
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
	def checksum(answer, value_a, value_b){
		if(answer == value_a + value_b){
			return true
		} else {
			return false
		}
	}

	def checkdiff(answer, value_a, value_b){
		if(answer == value_a - value_b){
			return true
		} else {
			return false
		}

	}
	def progress0(){
		def a = Math.abs(new Random().nextInt() % 8) + 1
		def b = Math.abs(new Random().nextInt() % 8) + 1

		def answer = System.console().readLine a + ' + ' + b +' = '
		
		if(!checksum(answer.toInteger(), a, b)){
			println "Error"
		}
	}

	def progress25(){
		def a = Math.abs(new Random().nextInt() % 6) + 8
		def b = Math.abs(new Random().nextInt() % 6) + 8

		def answer = System.console().readLine a + ' + ' + b +' = '

		if(!checksum(answer.toInteger(), a, b)){
			println "Error"
		}
	}

	def progress50(){
		def a = Math.abs(new Random().nextInt() % 8) + 1
		def b = Math.abs(new Random().nextInt() % a) + 1

		def answer = System.console().readLine a + ' - ' + b +' = '

		if(!checkdiff(answer.toInteger(), a, b)){
			println "Error"
		}
	}

	def progress75(){
		def a = Math.abs(new Random().nextInt() % 8) + 8
		def b = Math.abs(new Random().nextInt() % a) + 1

		def answer = System.console().readLine a + ' - ' + b +' = '

		if(!checkdiff(answer.toInteger(), a, b)){
			println "Error"
		}
	}
}