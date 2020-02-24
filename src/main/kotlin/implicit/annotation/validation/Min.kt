package implicit.annotation.validation

import implicit.annotation.Implicit
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.VALUE_PARAMETER

@Retention(RUNTIME)
@Target(VALUE_PARAMETER)
@Implicit
annotation class Min(val size:Float, val message:String = "")
