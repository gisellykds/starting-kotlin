package FirstSpringKotlinApp.operations

import FirstSpringKotlinApp.operations.internal.NumberValidation
import FirstSpringKotlinApp.operations.internal.Operation
import org.springframework.stereotype.Component

@Component
class DivOperation : Operation {
    override fun execute(x: Double, y: Double): Double {
        if (NumberValidation.IsZero(x) || NumberValidation.IsZero(y))
            throw Exception("division by zero")
        return x / y
    }
}