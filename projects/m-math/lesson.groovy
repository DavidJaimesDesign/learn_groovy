class Lesson{
	private Integer level
	private Float progress

	Lesson(Integer i_level, Float i_progress){
		level = i_level
		progress = i_progress
	}

	String getLevel(){
		return level
	}

	String getProgress(){
		return progress
	}

	String start(){
		def timer = new Timer()
		def lessonLoop = new Level1Loop() 	
		def endLesson = timer.runAfter(10000){
			println "Out of time Lesson complete"
			lessonLoop.stop()
		}

		lessonLoop.start()
	}
}