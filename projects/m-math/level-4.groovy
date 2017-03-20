//double digit multiplication long division fractions
class Level4Loop {
	private Integer level
	private Boolean lessonLoop
	private List 	wrongAnswers
	private Float progress
	Level4Loop(i_progress){
		level = 4
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
	//2 digit multiplication
	def progress0(){
		def a = Math.abs(new Random().nextInt() % 50) + 10
		def b = Math.abs(new Random().nextInt() % 50) + 10

		println '   ' + a
		println ' x ' + b
		println '--------'
		def answer = System.console().readLine ''
	}
	//2 digit multiplication
	def progress25(){
		def a = Math.abs(new Random().nextInt() % 100) + 20
		def b = Math.abs(new Random().nextInt() % 100) + 20

		println '   ' + a
		println ' x ' + b
		println '--------'
		def answer = System.console().readLine ''
	}
	//long division
	def progress50(){
		def a = Math.abs(new Random().nextInt() % 501) + 100
		def b = Math.abs(new Random().nextInt() % 20) + 1

		
		println  a + '| ' + b
		println '--------'
		def answer = System.console().readLine ''	
	}
	//reducing fractions
	def progress75(){
		def cd = Math.abs(new Random().nextInt() % 10) + 2
		def a  = (Math.abs(new Random().nextInt() % 9) + 1) * cd 
		def b  = (Math.abs(new Random().nextInt() % 9) + 1) * cd
 		
		def answer = System.console().readLine a + '/' + b + ' = '
	}		
}