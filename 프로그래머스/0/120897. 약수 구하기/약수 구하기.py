def solution(n):
    divisors = {i for i in range(1, int(n ** 0.5) + 1) if n % i == 0}
    divisors.update({n // i for i in divisors})
    return sorted(divisors)
