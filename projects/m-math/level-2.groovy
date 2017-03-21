//vertical addition and substraction
class Level2Loop {
	private Integer level
	private Boolean lessonLoop
	private List 	wrongAnswers
	private Float progress
	Level2Loop(i_progress){
		level = 2
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
		def a = Math.abs(new Random().nextInt() % 100) + 10
		def b = Math.abs(new Random().nextInt() % 100) + 10

		println '   ' + a
		println ' + ' + b
		println '--------'
		def answer = System.console().readLine ''

		if(!checksum(answer.toInteger(), a, b)){
			println "Error"
		}
	}

	def progress25(){
		def a = Math.abs(new Random().nextInt() % 501) + 100
		def b = Math.abs(new Random().nextInt() % 501) + 100

		println '   ' + a
		println ' + ' + b
		println '--------'
		def answer = System.console().readLine ''

		if(!checksum(answer.toInteger(), a, b)){
			println "Error"
		}
	}

	def progress50(){
		def a = Math.abs(new Random().nextInt() % 100) + 10
		def b = Math.abs(new Random().nextInt() % a) + 1

		println '   ' + a
		println ' - ' + b
		println '--------'
		def answer = System.console().readLine ''

		if(!checkdiff(answer.toInteger(), a, b)){
			println "Error"
		}
	}

	def progress75(){
		def a = Math.abs(new Random().nextInt() % 501) + 100
		def b = Math.abs(new Random().nextInt() % a) + 50

		println '   ' + a
		println ' - ' + b
		println '--------'
		def answer = System.console().readLine ''

		if(!checkdiff(answer.toInteger(), a, b)){
			println "Error"
		}	
	}
}