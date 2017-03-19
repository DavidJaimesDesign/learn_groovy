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
		def lessonLoop = levelSelect(level)	
		def endLesson = timer.runAfter(10000){
			println "Out of time Lesson complete"
			lessonLoop.stop()
		}

		lessonLoop.start()
	}

	private levelSelect(level){
		def lessonLoop
		switch(level) {
				case 1: lessonLoop = new Level1Loop(progress); break
				case 2: lessonLoop = new Level2Loop(progress); break
				case 3: lessonLoop = new Level3Loop(progress); break
				case 4: lessonLoop = new Level4Loop(progress); break
				case 5: lessonLoop = new Level5Loop(progress); break
				default: lessonLoop = new Level1Loop()
		}	

		return lessonLoop
	}
}