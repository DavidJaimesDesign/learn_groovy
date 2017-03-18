//double digit multiplication long division fractions
class Level4Loop {
	private Integer level
	private Boolean lessonLoop
	private List 	wrongAnswers
	//private Float progress
	Level4Loop(){
		level = 4
		lessonLoop = true
		wrongAnswers = []
	}
	def start(){
		while (lessonLoop) {
			def a = Math.abs(new Random().nextInt() % 10) + 1
			def b = Math.abs(new Random().nextInt() % 10) + 1

			def answer = System.console().readLine a + ' 4 ' + b +' = '
			if(answer.toInteger() != a + b){
				wrongAnswers << [a, b, answer.toInteger]
			}
		}
	}

	def stop(){
		lessonLoop = false
	}
}