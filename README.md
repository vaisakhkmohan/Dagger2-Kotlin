# Dagger2-Kotlin

    implementation 'com.google.dagger:dagger-android:2.20'
    implementation 'com.google.dagger:dagger-android-support:2.20'
    kapt 'com.google.dagger:dagger-android-processor:2.20'
    kapt 'com.google.dagger:dagger-compiler:2.20'
    
    
  **What is dependency injection :**
  Dependency Injection (DI) is a design pattern used to implement IoC. It allows the creation of dependent objects outside of a class and provides those objects to a class through   different ways. Using DI, we move the creation and binding of the dependent objects outside of the class that depends on them.

  **What is Dagger in android :**
  Dagger 2 is dependency injection framework. It is based on the Java Specification Request (JSR) 330. It uses code generation and is based on annotations. ... Dagger 2 uses the     following annotations: @Module and @Provides : define classes and methods which provide dependencies.
  
  **Use of Dagger2 :**
  Dagger 2 walks through the dependency graph and generates code that is both easy to understand and trace, while also saving you from writing a large amount of boilerplate code     you would normally need to write by hand to obtain references and pass them to other objects as dependencies.
