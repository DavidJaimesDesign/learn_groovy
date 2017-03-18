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
}