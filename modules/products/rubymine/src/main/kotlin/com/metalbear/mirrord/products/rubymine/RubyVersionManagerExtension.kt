package com.metalbear.mirrord.products.rubymine

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.util.PathMappingSettings
import org.jdom.Element
import org.jetbrains.plugins.ruby.remote.RubyRemoteSdkAdditionalData
import org.jetbrains.plugins.ruby.ruby.run.RubyAbstractRunner
import org.jetbrains.plugins.ruby.version.management.RubyVersionManagerHandler
import org.jetbrains.plugins.ruby.version.management.RubyVersionManagerSdkData

//package com.metalbear.mirrord.products.rubymine
//
//import org.jetbrains.plugins.ruby.version.management.RubyVersionManagerHandler
//import org.jetbrains.plugins.ruby.version.management.RubyVersionManagerSdkData
//
//// Assuming Data is a specific type, replace Data with the actual type you intend to use.
//class RubyVersionManagerExtension<Data>: RubyVersionManagerHandler() {
//
//    // Your class implementation goes here
//
//}

// newCommands.set(2, "bash -c 'export RUST_LOG=mirrord=trace && export DYLD_INSERT_LIBRARIES=/tmp/7057443585095317507-libmirrord_layer.dylib && /var/folders/sh/wljlm6jj0bd472x2c7c1tcxw0000gn/T/mirrord-bin/Users/mehularora/.rvm/bin/rvm ruby-3.1.4 do /Users/mehularora/.rvm/rubies/ruby-3.1.4/bin/ruby sdcdcqwdcqdwx sdcdcqwdcqdwx /Users/mehularora/.rvm/gems/ruby-3.1.4/gems/ruby-debug-ide-3.0.0.beta.12.1/bin/rdebug-ide --key-value --step-over-in-blocks --disable-int-handler --evaluation-timeout 10 --evaluation-control --time-limit 100 --memory-limit 0 --rubymine-protocol-extensions --port 54225 --host 0.0.0.0 --dispatcher-port 54226 -- /Users/mehularora/Documents/ruby-test/mirrord.rb'")

class RubyVersionManagerExtension<Data : RubyVersionManagerSdkData<Data>> : RubyVersionManagerHandler<Data>() {
    override fun getId(): String {
        TODO("Not yet implemented")
    }

    override fun createAdditionalData(): Data {
        TODO("Not yet implemented")
    }

    override fun doCreateAdditionalData(p0: RubyRemoteSdkAdditionalData): Data? {
        TODO("Not yet implemented")
    }

    @Deprecated("Deprecated in Java")
    override fun doLoadLegacy(p0: Element, p1: String): RubyVersionManagerSdkData<*> {
        TODO("Not yet implemented")
    }

    override fun doPatchCommandLine(
        p0: RubyAbstractRunner,
        p1: GeneralCommandLine,
        p2: MutableMap<String, String>,
        p3: MutableMap<String, String>,
        p4: Sdk,
        p5: PathMappingSettings
    ) {
        println("doPatchCommandLine")
        println(p0)
        println(p1)
        println(p2)
        println(p3)
        println(p4)
        println(p5)

//        super.doPatchCommandLine(p0, p1, p2, p3, p4, p5)
    }


}
