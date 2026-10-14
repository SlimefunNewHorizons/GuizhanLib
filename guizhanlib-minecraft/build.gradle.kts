dependencies {
    api(project(":guizhanlib-common", configuration = "shadow"))
    api(project(":guizhanlib-localization", configuration = "shadow"))
    api("io.papermc:paperlib:1.0.8")
    testImplementation("org.mockbukkit.mockbukkit:mockbukkit-v1.21:4.116.3")
    testImplementation("net.bytebuddy:byte-buddy:1.17.7")
    testImplementation("net.bytebuddy:byte-buddy-agent:1.17.7")
}
