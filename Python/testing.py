from mergeSortedArray import Solution


def run_case(case_name, nums1, m, nums2, n, expected):
	solver = Solution()
	actual = list(nums1)

	try:
		solver.merge(actual, m, nums2, n)
	except Exception as exc:
		print(f"[FAIL] {case_name}")
		print(f"  raised: {type(exc).__name__}: {exc}")
		print(f"  input: nums1={nums1}, m={m}, nums2={nums2}, n={n}")
		print(f"  expected: {expected}")
		return

	if actual == expected:
		print(f"[PASS] {case_name}: {actual}")
	else:
		print(f"[FAIL] {case_name}")
		print(f"  input: nums1={nums1}, m={m}, nums2={nums2}, n={n}")
		print(f"  expected: {expected}")
		print(f"  actual:   {actual}")


def main():
	test_cases = [
		("basic overlap", [1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3, [1, 2, 2, 3, 5, 6]),
		("nums2 empty", [1], 1, [], 0, [1]),
		("nums1 empty", [0], 0, [1], 1, [1]),
		("all from nums2", [0, 0, 0], 0, [2, 5, 6], 3, [2, 5, 6]),
		("duplicates", [2, 2, 3, 0, 0, 0], 3, [1, 2, 2], 3, [1, 2, 2, 2, 2, 3]),
	]

	for case in test_cases:
		run_case(*case)


if __name__ == "__main__":
	main()
