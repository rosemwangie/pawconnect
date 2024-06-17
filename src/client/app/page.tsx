import Link from 'next/link';

const Home = () => {
    return (
        <div className="container mx-auto px-4">
            <h1 className="text-2xl font-bold my-4">Paw Connect</h1>
            <div className="flex space-x-4">
                <Link href="/users/" className="bg-blue-500 text-white px-4 py-2 rounded">
                    View Users
                </Link>
                <Link href="/dogs/" className="bg-green-500 text-white px-4 py-2 rounded">
                    View Dogs
                </Link>
            </div>
        </div>
    );
}

export default Home;
