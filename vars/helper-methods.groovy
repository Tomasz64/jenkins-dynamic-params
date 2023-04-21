def changeBuildName(String name) {
    currentBuild.description = "I'm ${name}"
}