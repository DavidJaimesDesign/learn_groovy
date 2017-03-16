class Workout{
    private String name
    private List exercises

    Workout(String input, List lifts){
        name = input
        exercises = lifts
    }
        
    String listExercises(){
        return exercises.size()
    }

    static void addExercise(exercise){
       // println exercises.size()
    }

    String printWorkoutSS(){
        exercises.each{ lift ->
            println "${lift.getName()}: 3 sets of 5 reps at ${lift.getMax() * 0.80}"
        }
    }
}
