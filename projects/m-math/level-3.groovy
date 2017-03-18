//horizontal multiplication then division then 4 digit by 1 division
class Level3Loop {
	private Integer level
	private Boolean lessonLoop
	private List 	wrongAnswers
	//private Float progress
	Level3Loop(){
		level = 3
		lessonLoop = true
		wrongAnswers = []
	}
	def start(){
		while (lessonLoop) {
			def a = Math.abs(new Random().nextInt() % 10) + 1
			def b = Math.abs(new Random().nextInt() % 10) + 1

			def answer = System.console().readLine a + ' 3 ' + b +' = '
			if(answer.toInteger() != a + b){
				wrongAnswers << [a, b, answer.toInteger]
			}
		}
	}

	def stop(){
		lessonLoop = false
	}
}