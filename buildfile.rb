define 'l4j' do
  compile.with artifact('log4j:log4j:jar:1.2.17')
  test.using  :properties => { :"log.dir" => '/tmp'}
end
