# gradle-crash
A sample plugin config that causes gradle to crash

run
```
./gradlew crashTask
```

The most info I have is that you MUST have:
1. A nested extension object instantiated with an Action that is passed to a task as a property
2. The task *also* has an OutputDirectory on it (or any output to trigger caching?)
