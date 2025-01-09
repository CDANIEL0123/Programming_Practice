from collections import defaultdict

def solution(N, stages):
    answer = []
    num_users = len(stages)
    counts = defaultdict(int)
    for stage in stages:
        counts[stage] += 1
    
    failure_rates = []
    for i in range(1, N+1):
        if i in counts:
            failure_rate = counts[i] / num_users
            num_users -= counts[i]
        else:
            failure_rate = 0
        failure_rates.append((i, failure_rate))
    
    failure_rates.sort(key=lambda x: -x[1])
    for stage, _ in failure_rates:
        answer.append(stage)
    
    return answer




