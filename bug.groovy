```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

methodWithClosure { 
  // Simulate a long-running operation or unexpected exception
  sleep(2000) 
  throw new RuntimeException("Something went wrong!")
}
println "This line should not be printed"
```