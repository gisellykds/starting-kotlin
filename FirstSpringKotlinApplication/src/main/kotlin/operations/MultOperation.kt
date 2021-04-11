package FirstSpringKotlinApp.operations

import FirstSpringKotlinApp.operations.internal.Operation
import org.springframework.stereotype.Component

@Component
class MultOperation : Operation {
    override fun execute(x: Double, y: Double): Double {
        return x * y
    }
}