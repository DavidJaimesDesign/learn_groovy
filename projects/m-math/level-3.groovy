//horizontal multiplication then division then 4 digit by 1 division
class Level3Loop {
	private Integer level
	private Boolean lessonLoop
	private List 	wrongAnswers
	private Float progress
	Level3Loop(i_progress){
		level = 3
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

	def progress0(a = 1, b = 1){
		def answer = System.console().readLine a + ' x ' + b +' = '
		if(b == 13){
			progress0(a += 1, 0)
		} else {
			progress0(a, b+=1)
		}
	}

	def progress25(){
		def a = Math.abs(new Random().nextInt() % 13) + 1
		def b = Math.abs(new Random().nextInt() % 13) + 1

		def answer = System.console().readLine a + ' x ' + b +' = '
	}

	def progress50(){
		def a = Math.abs(new Random().nextInt() % 1000) + 10
		def b = Math.abs(new Random().nextInt() % 10) + 1

		println '   ' + a
		println ' x ' + b
		println '--------'
		def answer = System.console().readLine ''
	}

	def progress75(){
		def a = Math.abs(new Random().nextInt() % 501) + 100
		def b = Math.abs(new Random().nextInt() % a) + 50

		
		println  a + '| ' + b
		println '--------'
		def answer = System.console().readLine ''	
	}
}