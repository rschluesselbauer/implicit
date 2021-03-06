package implicit.interceptor.validator

import implicit.annotation.validation.NotBlank
import implicit.exception.ImplicitValidationException
import java.lang.reflect.Method

internal class NotBlankValidator(val annotation: NotBlank) : AbstractValidator() {

    override fun validate(values: List<*>, method: Method) {
        for (value in values) {
            if (value ==null){
                throwImplicitValidationException(method)
            }
            when (value) {
                is String -> if(value.isBlank()) throwImplicitValidationException(method)

            }
        }
    }

    fun throwImplicitValidationException(method: Method){
        if (annotation.message.isNotBlank())
            throw ImplicitValidationException(annotation.message)
        throw ImplicitValidationException("value of field '${method.name}' is empty")
    }

}
