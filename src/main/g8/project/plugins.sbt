resolvers += Resolver.mavenLocal
resolvers += Resolver.sonatypeRepo("snapshots")
resolvers += Resolver.sonatypeRepo("releases")
resolvers += ("mchange-repo" at "https://www.mchange.com/repository")

addSbtPlugin("com.silamoney" % "sila-cli-plugin" % "$sila_cli_plugin_version$")
