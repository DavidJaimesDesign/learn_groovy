println "Welcome to LifTrack version 0.1"
println "This program is what I am going to use to learn groovy"
println "Each version will add a new groovy concept"

def username = System.console().readLine "Please input a user name:"

def user = new User(username)

println "You username is " + user.getName()
