println"___  ___      ___  ___  ___ _____ _   _ "
println"|  \\/  |      |  \\/  | / _ \\_   _| | | |"
println"| .  . |______| .  . |/ /_\\ \\| | | |_| |"
println"| |\\/| |______| |\\/| ||  _  || | |  _  |"
println"| |  | |      | |  | || | | || | | | | |"
println"\\_|  |_/      \\_|  |_/\\_| |_/\\_/ \\_| |_/"
println"Welcome to M-Math the app to sharpen your mental math skills."
def lessonSelect = System.console().readLine 'What level do you want 1-4? '
def progression  = System.console().readLine 'Select progression 0, 0.25, 0.50, 0.75: '	
//add a progression check here 		
def lesson = new Lesson(lessonSelect.toInteger(), progression.toFloat())
println lesson.getLevel()
println lesson.getProgress()
lesson.start()



                                        
                                                                                
