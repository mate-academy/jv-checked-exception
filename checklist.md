### Common mistakes

#### Don’t use commented code.
It's important to develop good practices from the very beginning and fix bad ones. Pushing commented code belongs to the second group.
So always check the final solution for the absence of commented code. 
The main problem is that commented code adds confusion with no real benefit because while reading the code 
with commented lines in it you will waste time analyzing its purpose and the reason it was added in the first place. 

#### Don’t complicate if-else construction. [Detailed explanation](https://mate-academy.github.io/jv-program-common-mistakes/java-core/complicated-if-else.html)

#### Be attentive about the class you extend to declare your exception.
Should it extend `RuntimeException` or `Exception` and why? (double check task description)

#### Don’t create unneeded variables.
Try to keep your code simple. That is one of the core principles of programming. If you create a variable without any 
particular reason in mind - think twice if it is required and whether we can complete the task without it and we won't 
decrease code readability.

#### Remember about informative names of the variables.

#### Don't complicate your code with a lot of empty lines.
```
Bad example:
public int add(int a, int b) {

    int result = a + b;
    
    
    return result;
    
}

Good example:
public int add(int a, int b) {
    return a + b;
}
```

#### Don't hardcode the message in the exception class, pass it to the constructor.
Hardcoding reduces the flexibility of the code by forcing actual values into the source code.

#### Any magic numbers should be constants
Your code should be easy to read. Move all hardcoded values 
to [constant fields](https://mate-academy.github.io/style-guides/java/java.html#s5.2.4-constant-names) and give them informative names.
