```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Error in closure: ${e.message}"
  }
  println "After closure execution"
}

methodWithClosure { 
  // Simulate a long-running operation or unexpected exception
  sleep(2000)
  throw new RuntimeException("Something went wrong!")
}
println "This line will now be printed"
```