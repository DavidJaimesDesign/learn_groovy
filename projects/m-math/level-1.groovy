class Level1Loop {
	private Integer level
	private Boolean lessonLoop
	private List 	wrongAnswers
	//private Float progress
	Level1Loop(){
		level = 1
		lessonLoop = true
		wrongAnswers = []
	}
	def start(){
		while (lessonLoop) {
			def a = Math.abs(new Random().nextInt() % 10) + 1
			def b = Math.abs(new Random().nextInt() % 10) + 1

			def answer = System.console().readLine a + ' + ' + b +' = '
			if(answer.toInteger() != a + b){
				wrongAnswers << [a, b, answer.toInteger]
			}
		}
	}

	def stop(){
		lessonLoop = false
	}
}