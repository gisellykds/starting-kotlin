package FirstSpringKotlinApp.operations

import FirstSpringKotlinApp.operations.internal.Operation
import org.springframework.stereotype.Component

@Component
class SumOperation : Operation {
    override fun execute(x: Double, y: Double): Double {
        return x + y
    }
}