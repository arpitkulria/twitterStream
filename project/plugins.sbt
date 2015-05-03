resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

// scoverage Plugin
resolvers += Classpaths.sbtPluginReleases

