#include <iostream>
#include <string>
#include <cassert>

class Game
{
public:
    virtual std::string result() = 0;
};

class FakeFootballGame : public Game
{
public:
    std::string result()
    {
        return "3:2";
    }
};

int main()
{
    FakeFootballGame game = FakeFootballGame();
    assert(game.result() == "3:2");
    std::cout<<"All tests passed ✅"<<std::endl;
    return 0;
}