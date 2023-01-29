def fizzbuzz(number)
  if number % 15 == 0
    "FizzBuzz"
  elsif number % 3 == 0
    "Fizz"
  elsif number % 5 == 0
    "Buzz"
  else
    puts number.to_i
  end
end

puts "数字を入力してください"

a = gets.to_i

puts fizzbuzz(a)

