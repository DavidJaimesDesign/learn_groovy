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
			def a = Math.abs(new Random().nextInt() % 10) + 1
			def b = Math.abs(new Random().nextInt() % 10) + 1

			def answer = System.console().readLine a + ' 5 ' + b +' = '
			if(answer.toInteger() != a + b){
				wrongAnswers << [a, b, answer.toInteger]
			}
		}
	}

	def stop(){
		lessonLoop = false
	}
}