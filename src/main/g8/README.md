# Tensorflow template


## Dependencies
Tensorflow 1.4

## Status

## Project structure

```
├─ src/           - Source code
│  ├─ main/       - Main implementation code 
│  │  ├─ scala/
│  ├─ test/       - Test code
│  │  ├─ scala/
├─ build.gradle   - Build file for this project
├─ scalastyle-config.xml        - scala style
```



## Project building

For building, please, use provided `gradlew` command:

```
./gradle build
```

### Run
For running an application:

```
./gradle run
```

## Running tests

To run tests, please, run:

```
./gradle test
```



# Checking code style

To check codestyle:

```
./gradle scalaStyle
```


# To build self-run jar:

```
./gradle shadowJar
```


# And to run it:
```
java -cp test_tf.jar com.yarenty.tensorflow.Main
```

