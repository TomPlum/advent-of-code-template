dependencies {
    "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.10.2")
    "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    "testImplementation"("org.junit.jupiter:junit-jupiter-params:5.10.2")
    "testImplementation"("org.junit.platform:junit-platform-launcher:1.10.2")
    "testImplementation"("com.willowtreeapps.assertk:assertk-jvm:0.28.0")
}

tasks.withType<Test> {
    useJUnitPlatform { }
}