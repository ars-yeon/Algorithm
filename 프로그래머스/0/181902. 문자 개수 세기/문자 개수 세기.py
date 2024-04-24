def solution(my_string):
    answer = [0] * 52

    for s in my_string:
        k = 65 if s.isupper() else 71
        idx = ord(s) - k
        answer[idx] += 1

    return answer