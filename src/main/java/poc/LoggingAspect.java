package poc;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution (* poc.RandomNumberGenerator.roll(..))")
	public void logBefore(JoinPoint joinPoint) {
		logger.debug("******");
		logger.debug("logBefore() is running!");
		logger.debug("about to run : " + joinPoint.getSignature().getName());
		logger.debug("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("******");
	}
	/*
	@After("execution (* poc.RandomNumberGenerator.roll(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("logAfter() is running!");
		System.out.println("just run : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	*/
	@AfterReturning(
		pointcut = "execution (* poc.RandomNumberGenerator.roll(..))",
		returning= "result"
			)
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		logger.debug("******");
		logger.debug("logAfterReturning() is running!");
		logger.debug("completed running : " + joinPoint.getSignature().getName());
		logger.debug("Method returned value is : " + result);
		logger.debug("******");
	}
	
	/*
	@Around("execution (* poc.RandomNumberGenerator.roll(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("logAround() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("Around before is running!");
		joinPoint.proceed(); // continue on the intercepted method
		System.out.println("Around after is running!");
		System.out.println("******");
	}
	*/
}
