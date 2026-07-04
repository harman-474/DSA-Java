# Dutch National Flag Algorithm

## Big Picture

Use three pointers to divide an array into three groups.

## Pointers

- `low` = where the next `0` goes
- `mid` = current element being checked
- `high` = where the next `2` goes

## Rules

If `nums[mid] == 0`:

- Swap with `low`
- Move `low`
- Move `mid`

If `nums[mid] == 1`:

- Move `mid`

If `nums[mid] == 2`:

- Swap with `high`
- Move `high`
- Do not move `mid` yet

## Key Pattern

```text
0s | unknown | 2s