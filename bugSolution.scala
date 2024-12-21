```scala
class MyClass[T](val value: T) {
  def myMethod[R](f: T => R): R = f(value)
}

val myInstance = new MyClass(10)
val result = myInstance.myMethod(x => x.toString())
println(result) // Works fine

val myInstance2 = new MyClass("hello")
val result2 = myInstance2.myMethod(x => x.length()) // Now compiles and works fine
println(result2)
```