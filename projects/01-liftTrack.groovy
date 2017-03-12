println "Welcome to LifTrack version 0.1"
println "This program is what I am going to use to learn groovy"
println "Each version will add a new groovy concept"

def username = System.console().readLine "Please input a user name:"

def user = new User(username)

println "You username is " + user.getName()

def squatMax = System.console().readLine "What is your squat max?"
def dlMax    = System.console().readLine "What is your deadliftmax?"
def benchMax = System.console().readLine "What is your bench max?"
def ohpMax   = System.console().readLine "What is your overhead press max?"

def squat = new Exercise("Squat", squatMax.toInteger())
def dl    = new Exercise("DeadLift", dlMax.toInteger())
def bench = new Exercise("Bench", benchMax.toInteger())
def ohp   = new Exercise("OverHeadPress", ohpMax.toInteger())

def workout = [squat, dl, bench, ohp]

println "These are your current maxes"

workout.each { exercise ->
    println exercise.getName() + " max: " + exercise.getMax()
}
