import dagger.Module
import dagger.Provides

@Module
class PumpModule {
    @Provides
    fun providePump(): Pump = object : Pump {
        override fun pump() = println("=> => pumping => =>")
    }
}